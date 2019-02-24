$(function () {
    //    $("#nav ul li").mouseover(function () {
    //        $(this).addClass("active");
    //    });
    //    $("#nav ul li").mouseleave(function(){
    //        $(this).removeClass("active");
    //    })
    //    $("#nav ul li").click(function(e){
    //        $(this).addClass("active");
    //    })
       $("#nav li").click(function (e) {  
           e.preventDefault();
           $(this).tab("show");
           window.location.href = $(this).children('a').attr('href')
       });
       $("#fileOperate .fileLeft li").click(function (e) {  
              e.preventDefault();
           $(this).tab("show");    
       })
    




       
});
 
