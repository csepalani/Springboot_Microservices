$(document).ready(function() {
    $.ajax({
        url: "http://localhost:9000/model"
    }).then(function(data, status, jqxhr) {
       $('.model-id').append(data.id);
       $('.model-content').append(data.content);
       console.log(jqxhr);
    });
});