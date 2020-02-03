function comprobar()
    {
       var Mensaje = document.formu.nombre.value;
       if (Mensaje.length >= 15)
       {
         alert("La longitud del texto ingresado es igual a 15 caracteres.")
          form.nombre.value="";
          return false;
       }
       return true;
    }
    
  