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

function rigister() {
    $.ajax({
        type: "get",
        url: "/register",
        async: true,
        success: function (result) {
            document.body.innerHTML = result;
        }
    });
}

function loginDo() {
    $.ajax({
        type: "post",
        url: "/login/do",
        async: true,
        data: $("#form1").serialize(),
        success: function (result) {
            if (result.result == "error") {
                alert("用户名或密码错误！");
            } else {
                goIndex(result);
            }
        }
    });
}

function goIndex(x) {
    $.ajax({
        type:"get",
        url:"/login/do2?tel=" + x.tel,
        async: true,
        success: function (res) {
            document.body.innerHTML = res;
        }
    });
}

function registerDo() {
    $.ajax({
        type: "post",
        url: "/rigister/do",
        async: false,
        data: $("#form2").serialize(),
        success: function (res) {
            if (res.result == "error") {
                alert("账号已存在！！！");
            } else {
                alert("注册成功!")
                registerDo2(res);
            }
        }
    });
}

function registerDo2(x) {
    $.ajax({
        type: "get",
        url: "/register/do2“
        async: false,
        success: function (res) {
            document.body.innerHTML = res;
        }
    });
}

function checkRegister() {
    var password1 = $("#input1").value;
    var password2 = $("#input2").value;
    if (password1 != password2) {
        alert("两次密码输入不一致");
    }
}
