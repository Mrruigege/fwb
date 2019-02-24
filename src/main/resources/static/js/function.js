function fileOperation(id,index) {  
        var upload = $("#upload"),
            send = $("#send"),
            combine = $("#combine");
        upload.hide();
        send.hide();
        combine.hide();
        $(id).show();
        var leftImg = $("#leftImg");
        switch (index) {
            case 1:
            leftImg.attr("src","../image/upload/file-left.png");
                break;
            case 2:
            leftImg.attr("src","../image/send/file-left.jpg");
                break;
            case 3:
                leftImg.attr("src","../image/combine/file-left.png");
                
                break;
        
            default:
                break;
        }
}