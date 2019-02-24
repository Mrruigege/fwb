$(function(){
    $("#fileOperate .fileLeft li").click(function (e) {  
           e.preventDefault();
           $(this).tab("show");    
       })
       



    $("#father").delegate(".lesson","click",function(event){
        var target = $(event.target);
        var arr = "";
        target.css("background-color","red");
        for (let i = 0; i < 3; i++) {
            if(target.parentName == li){
                arr = target.parent.html();
                alert(arr)
            }
            
        }
        alert(target.html())
        
    })
    
});
