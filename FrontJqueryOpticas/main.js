$(document).ready(function() {
	// alert("Mensaje de Prueba!!!!");
tabla();
});


function tabla(){
	$.ajax({
		method: 'get',
		url:'http://localhost:9001/WebService/Api/lista',
		contentType: 'application/json; charset=UTF-8',
		dataType:'json',

		success : function(response){
         console.log("Respuesta el servidor --->"+JSON.stringify(response));
         
         var lista = '';

         response.forEach(obj => {
            console.log("Objetos "+JSON.stringify(obj));
            
            lista += '<tr>'+
                         '<td>'+obj.id+'</td>'+
                         '<td>'+obj.nombre+'</td>'+
                         '<td>'+obj.marca+'</td>'+
                         '<td>'+obj.modelo+'</td>'+
                         '<td>'+obj.armazon+'</td>'+
                         '<td>'+obj.mica+'</td>'+
                         '<td>'+obj.graduacion+'</td>'+
                         '<td>'+obj.precio+'</td>'+
	                      '<td>'+obj.tipo+'</td>'+
	                      '<td><a class="btn btn-warning" id="abrirEditar" data="'+obj.id+'">Editar</a></td>'+
	                      '<td><a class="btn btn-danger btn-danger" idEliminar="'+obj.id+'" data="'+obj.id+'">Eliminar</a></td>'+
                      '</tr>';

           })
         $('#Tabla').html(lista);     
		}
	});
}


// Metodo Guardar 

$('#abrirGuardar').click(function(){
	$('#modalAgregar').modal('show');
});

$('#btnGuardar').click(function(){

	var json ={
		id:parseInt($('#id').val()),
		nombre :$('#nombre').val(),
		marca :$('#marca').val(),
		modelo :$('#modelo').val(),
		armazon :$('#armazon').val(),
		mica :$('#mica').val(),
		graduacion :parseInt($('#graduacion').val()),
		precio:parseFloat($('#precio').val()),
		tipo :$('#tipo').val(),
	};

	console.log("JSON-> a enviar"+JSON.stringify(json));

	$.ajax({
		method: 'post',
		url:'http://localhost:9001/WebService/Api/guardar',
		data:JSON.stringify(json),      
		contentType: 'application/json; charset=UTF-8',
		dataType:'json',

		success:function(response){
			console.log("JSON-> a enviar"+JSON.stringify(response));

		},
		error:function(resultado){
			if(resultado.status == 200){
				Swal.fire({
					icon: 'success',
					title: 'Se guardo el modelo',
					showConfirmButton: false,
					timer: 2000
				});
				setTimeout('location.reload()',2500);
			}else{
				Swal.fire({
					title: 'Error al guardar!',
					text: '!Error¡',
					type:'error',
					timer: 2000,
					showConfirmButton: false,
					confirButtonText: 'Cerrar'
				});
			}
		}
	});
});

// Buscar Para Editar 
$('#Tabla').on('click','#abrirEditar', function(){

   var id = $(this).attr('data');
   console.log("id a buscar->"+id);

   var json = {"id":id};
    
    $.ajax({
          method: 'post',
          url:'http://localhost:9001/WebService/Api/buscar',            
          data:JSON.stringify(json),      
          contentType: 'application/json; charset=UTF-8',
          dataType:'json',

          success:function(response){
            $('#modalEditar').modal('show');
	        $('#idE').val(response.id);
			$('#nombreE').val(response.nombre);
			$('#marcaE').val(response.marca);
			$('#modeloE').val(response.modelo);
			$('#armazonE').val(response.armazon);
			$('#micaE').val(response.mica);
			$('#graduacionE').val(response.graduacion);
			$('#precioE').val(response.precio);
			$('#tipoE').val(response.tipo);
           
          }
    });
});

$('#btnEditar').click(function(){

    var json={
        id:parseInt($('#idE').val()),
        nombre :$('#nombreE').val(),
        marca :$('#marcaE').val(),
        modelo :$('#modeloE').val(),
        armazon :$('#armazonE').val(),
        mica :$('#micaE').val(),
        graduacion:parseInt($('#graduacionE').val()),
        tipo :$('#tipoE').val(),
        precio :parseFloat($('#precioE').val()),
    };

 $.ajax({
          method: 'post',
          url:'http://localhost:9001/WebService/Api/editar',            
          data:JSON.stringify(json),      
          contentType: 'application/json; charset=UTF-8',
          dataType:'json',

          success:function(response){
            console.log("JSON-> a enviar"+JSON.stringify(response));
   
          },
          error:function(resultado){
            if(resultado.status == 200){
               Swal.fire({
                 icon: 'success',
                 title: 'Se actualizo la información',
                 showConfirmButton: false,
                 timer: 2000
               });
               setTimeout('location.reload()',1500);
            }else{
                Swal.fire({
                 title: 'Error al actualizar!',
                 text: '!Error¡',
                 type:'error',
                 timer: 2000,
                 showConfirmButton: false,
                 confirButtonText: 'Cerrar'
               });
            }
          }
      
      });
});

$('#Tabla').on('click','.btn-danger',function(){
   var idEliminar = $(this).attr('data');
   console.log("IdELiminar-->"+idEliminar);

    var json ={
         id:parseInt(idEliminar)
   };

    Swal.fire({
        title: '¿Desea eliminar?',
        text: 'Cancelar',
        type: 'btn-warnig',
        showCancelButton: true,
        confirmButtonColor: '#3085d6',
        cancelButtonColor: '#d33',
        cancelButtonText: 'Cancelar',
        confirButtonText: 'Eliminar',
    }).then(function(response){
        if(response.isConfirmed){
            $.ajax({
                type: 'post',
                url: 'http://localhost:9001/WebService/Api/eliminar',
                data: JSON.stringify(json),
                contentType: 'application/json; charset=utf-8',
                success: function(respuesta){
                    Swal.fire("Eliminado","","success")
                    setTimeout('location.reload()',1500)
                },
                error: function(){
                    Swal.fire({
                        title: 'Error al eliminar',
                        text: '!Error¡',
                        type: 'error',
                        timer: 2000,
                        showConfirmButton: false,
                        confirButtonText: 'Cerrar'
                      })
                }
            })
        }
    } )

});  