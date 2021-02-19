var buscador = $("#table").DataTable();

$("#input-search").keyup(function(){
    
    buscador.search($(this).val()).draw();
    
    if ($("#input-search").val() == ""){
        $(".content-search").fadeOut(150);/* color*/
    }else{
        $(".content-search").fadeIn(150);
    }
})