function login() {
    $.ajax({
        type: "get",
        url: "/login",
        async: true,
        success: function(result) {
            document.body.innerHTML = result;
        }
    });
}


function loginDo() {
    $.ajax({
        type: "post",
        url: "/login/do",
        async: true,
        data: $("form1").serialize(),
        success: function (result) {
            document.body.innerHTML = result;
        }
    });
}
