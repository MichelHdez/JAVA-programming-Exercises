$(document).ready(function() {
	//alert("Hola");
   tabla();
});

/*
$(function() {
	alert("Hola");
});*/


/*Jquery --> es una libreria de java script --> brinda funcione y enventos --> pérmte manipular 
etiquetas html --> por etiqueta, por clase o por id 
*/

function tabla(){
	$.ajax({
		method: 'get',
		url:'http://localhost:9001/WebService/Api/listaDao',
		contentType: 'application/json; charset=UTF-8',
		dataType:'json',

		success : function(responce){
         console.log("Responce -> Respuesta el servidor ->"+JSON.stringify(responce));
         
         var lista = '';

         responce.forEach(objetos => {
            console.log("Objectos "+JSON.stringify(objetos));
            
            lista += '<tr>'+
            '<td>'+objetos.id+'</td>'+
            '<td>'+objetos.marca+'</td>'+
            '<td>'+objetos.modelo+'</td>'+
            '<td>'+objetos.color+'</td>'+
            '<td>'+objetos.peso+'</td>'+
            '<td>'+objetos.precio+'</td>'+
            '<td>'+objetos.so+'</td>'+
            '<td><a class="btn btn-warning" id="abrirEditar" data="'+objetos.id+'">Editar</a></td>'+
            // '<td><a class="btn btn-danger btn-danger" idEliminar="'+objetos.id+'" data="'+objetos.id+'">Eliminar</a></td>'+
            '<td><a class="btn btn-danger btnEliminar" idEliminar="'+objetos.id+'" data="'+objetos.id+'">Eliminar</a></td>'+
            '</tr>';

         })
         $('#Tabla').html(lista);
         /*funcion 
         $(function(){
         	$('#buscar').on('keyup',function(){
         	  var value = $(this).val().toLowerCase();
         	  $('#Tabla tr').filter(function(){
         	  	$(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
         	  });
         	 })    
          });  */     
      }
   });
}

// Buscar Por Cualquier atributo

$('#buscarXatributo').click(function(){

   var marca =$('#buscar').val();
   var modelo =$('#buscar').val();
   var precio =$('#buscar').val();

   

   var json = {"marca":marca, "modelo":modelo,"precio":precio};
   console.log("JSON a buscar->"+JSON.stringify(json));
   
   var json = '';

   if(marca != '' || modelo !=''){
     json = {marca,modelo};

  }
  if(!isNaN(precio)){
     json = {precio};
  }
  $.ajax({
   type:'ajax',
   method: 'post',
   url:'http://localhost:9001/WebService/Api/buscarXatributo',
   data:JSON.stringify(json),
   contentType: 'application/json; charset=UTF-8',
   

   success : function(responce){
      console.log("Responce -> Respuesta el servidor ->"+JSON.stringify(responce));
      
      var lista1 = '';

      responce.forEach(objetos => {
         console.log("Objectos "+JSON.stringify(objetos));
         
         lista1 += '<tr>'+
         '<td>'+objetos.id+'</td>'+
         '<td>'+objetos.marca+'</td>'+
         '<td>'+objetos.modelo+'</td>'+
         '<td>'+objetos.color+'</td>'+
         '<td>'+objetos.peso+'</td>'+
         '<td>'+objetos.precio+'</td>'+
         '<td>'+objetos.so+'</td>'+

         '</tr>';

      })
      $('#Tabla').html(lista1);                
   }
});  

});

// metodo guardar 

$('#abrirGuardar').click(function(){
   $('#modalAgregar').modal('show');
});

$('#btnGuardar').click(function(){

   /*
   var id =$('#id').val();
   var marca =$('#marca').val();
   var modelo =$('#modelo').val();
   var color =$('#color').val();
   var peso =$('#peso').val();
   var precio =$('#precio').val();
   var so =$('#so').val();

   console.log("id->"+id);
   console.log("marca->"+marca);
   console.log("modelo->"+modelo);
   console.log("color->"+color);
   console.log("peso->"+peso);
   console.log("precio->"+precio);
   console.log("so->"+so);*/

   var json ={
      id:parseInt($('#id').val()),
      marca:$('#marca').val(),
      modelo :$('#modelo').val(),
      color :$('#color').val(),
      peso :$('#peso').val(),
      precio:parseFloat($('#precio').val()),
      so :$('#so').val(),
   };

   console.log("JSON-> a enviar"+JSON.stringify(json));

   $.ajax({
    method: 'post',
    url:'http://localhost:9001/WebService/Api/guardar',            
    data:JSON.stringify(json),      
    contentType: 'application/json; charset=UTF-8',
    dataType:'json',

    success:function(responce){
      console.log("JSON-> a enviar"+JSON.stringify(responce));
      
   },
   error:function(resultado){
      if(resultado.status == 200){
         Swal.fire({
           icon: 'success',
           title: 'Se guardo la computadora',
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
     url:'http://localhost:9001/WebService/Api/buscar',            
     data:JSON.stringify(json),      
     contentType: 'application/json; charset=UTF-8',
     dataType:'json',

     success:function(responce){
      $('#modalEditar').modal('show');
      $('#idE').val(responce.id);
      $('#marcaE').val(responce.marca);
      $('#modeloE').val(responce.modelo);
      $('#colorE').val(responce.color);
      $('#pesoE').val(responce.peso);
      $('#precioE').val(responce.precio);
      $('#soE').val(responce.so);
      
   }

});


});

$('#btnEditar').click(function(){

   var json ={
      id:parseInt($('#id').val()),
      marca:$('#marca').val(),
      modelo :$('#modelo').val(),
      color :$('#color').val(),
      peso :$('#peso').val(),
      precio:parseFloat($('#precio').val()),
      so :$('#so').val(),
   };


   $.ajax({
    method: 'post',
    url:'http://localhost:9001/WebService/Api/editar',            
    data:JSON.stringify(json),      
    contentType: 'application/json; charset=UTF-8',
    dataType:'json',

    success:function(responce){
      console.log("JSON-> a enviar"+JSON.stringify(responce));
      
   },
   error:function(resultado){
      if(resultado.status == 200){
         Swal.fire({
           icon: 'success',
           title: 'Se actualizó la computadora',
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
    cancelButtonText: 'cancelar',
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