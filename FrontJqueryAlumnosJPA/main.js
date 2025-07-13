$(document).ready(function() {
	//alert("Hola");
   tabla();
});


/*Jquery --> es una libreria de java script --> brinda funcione y enventos --> pérmte manipular 
etiquetas html --> por etiqueta, por clase o por id 
*/

function tabla(){
	$.ajax({
		method: 'get',
		url:'http://localhost:9001/WebService/lista',
		contentType: 'application/json; charset=UTF-8',
		dataType:'json',

		success : function(response){
         console.log("Response -> Respuesta el servidor ->"+JSON.stringify(response));
         
         var lista = '';

         response.forEach(objetos => {
            console.log("Objectos "+JSON.stringify(objetos));
            
            lista += '<tr>'+
            '<td>'+objetos.id+'</td>'+
            '<td>'+objetos.nombre+'</td>'+
            '<td>'+objetos.app+'</td>'+
            '<td>'+objetos.edad+'</td>'+
            '<td>'+objetos.curso+'</td>'+
            '<td>'+objetos.semestre+'</td>'+
            '<td>'+objetos.promedio+'</td>'+
            '<td><a class="btn btn-warning" id="abrirEditar" data="'+objetos.id+'">Editar</a></td>'+
            // '<td><a class="btn btn-danger btn-danger" idEliminar="'+objetos.id+'" data="'+objetos.id+'">Eliminar</a></td>'+
            '<td><a class="btn btn-danger btnEliminar" idEliminar="'+objetos.id+'" data="'+objetos.id+'">Eliminar</a></td>'+
            '</tr>';

         })
         $('#Tabla').html(lista);  
      }
   });
}



// metodo guardar 
$('#abrirGuardar').click(function(){
   $('#modalAgregar').modal('show');
});

$('#btnGuardar').click(function(){

   var json ={
      id:parseInt($('#id').val()),
      nombre:$('#nombre').val(),
      app :$('#app').val(),
      edad :parseInt($('#edad').val()),
      curso :$('#curso').val(),
      semestre:parseInt($('#semestre').val()),
      promedio :parseFloat($('#promedio').val()),
   };

   console.log("JSON-> a enviar"+JSON.stringify(json));

   $.ajax({
    method: 'post',
    url:'http://localhost:9001/WebService/guardar',            
    data:JSON.stringify(json),      
    contentType: 'application/json; charset=UTF-8',
    dataType:'json',

    success:function(response){
      // console.log("JSON-> a enviar"+JSON.stringify(response));
      
   },
   error:function(resultado){
      if(resultado.status == 200){
         Swal.fire({
           icon: 'success',
           title: 'Se guardo el alumno',
           showConfirmButton: false,
           timer: 2000
        });
         setTimeout('location.reload()',1500);
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

// Buscar para Editar
$('#Tabla').on('click','#abrirEditar', function(){

   var id = $(this).attr('data');
   console.log("id a buscar->"+id);

   var json = {"id":id};
   
   $.ajax({
     method: 'post',
     url:'http://localhost:9001/WebService/buscar',            
     data:JSON.stringify(json),      
     contentType: 'application/json; charset=UTF-8',
     dataType:'json',

     success:function(response){
      $('#modalEditar').modal('show');
      $('#idE').val(response.id);
      $('#nombreE').val(response.nombre);
      $('#appE').val(response.app);
      $('#edadE').val(response.edad);
      $('#cursoE').val(response.curso);
      $('#semestreE').val(response.semestre);
      $('#promedioE').val(response.promedio);  
    }
  });
});

$('#btnEditar').click(function(){

    var json={
      id:parseInt($('#idE').val()),
      nombre:$('#nombreE').val(),
      app :$('#appE').val(),
      edad :parseInt($('#edadE').val()),
      curso :$('#cursoE').val(),
      semestre:parseInt($('#semestreE').val()),
      promedio :parseFloat($('#promedioE').val()),
    };

 $.ajax({
          method: 'post',
          url:'http://localhost:9001/WebService/editar',            
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

// Eliminar
$('#Tabla').on('click','.btn-danger',function(){
   var idEliminar = $(this).attr('data');
   console.log('IdEliminar--->'+idEliminar);

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
        url: 'http://localhost:9001/WebService/eliminar',
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
});
});
