//Eliminar por el ID
function createDOM(ClassName="prueba") {
    var div = document.getElementById("contenedor")
    div.innerHTML = "<span class="+ClassName+">se sumo una etiqueta span:  " +"</span>"
}
//Eliminar por la Classe
function deleteDOM(ClassName="prueba") {
    var span = document.getElementsByClassName("Prueba");
    span.parentNode.remove("prueba");
}
// Eliminar por el Id
function deleteDOM(ClassName="prueba") {
    var div = document.getElementById("contenedor");
    div.parentNode.remove("prueba");
}

