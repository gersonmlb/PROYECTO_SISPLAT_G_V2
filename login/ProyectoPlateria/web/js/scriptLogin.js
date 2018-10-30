$(document).ready(function (){
    'use strict';

    var usernameError = true,
        emailError    = true,
        passwordError = true,
        passConfirm   = true;
        
    if (navigator.userAgent.toLowerCase().indexOf('firefox') > -1) {
        $('.form form label').addClass('fontSwitch');
    }

    // Efecto label
    $('input').focus(function () {

        $(this).siblings('label').addClass('active');
    });

    // Validar Input
    $('input').blur(function () {

        // Usuario
        if ($(this).hasClass('name')) {
            if ($(this).val().length === 0) {
                $(this).siblings('span.error').text('Porfavor ingrese su nombre de usuario').fadeIn().parent('.form-group').addClass('hasError');
                usernameError = true;
            } else if ($(this).val().length > 1 && $(this).val().length <= 4) {
                $(this).siblings('span.error').text('Su nombre de usuario tiene que tener mas de 4 caracteres').fadeIn().parent('.form-group').addClass('hasError');
                usernameError = true;
            } else {
                $(this).siblings('.error').text('').fadeOut().parent('.form-group').removeClass('hasError');
                usernameError = false;
            }
        }
        // Email
        if ($(this).hasClass('email')) {
            if ($(this).val().length == '') {
                $(this).siblings('span.error').text('Porfavor ingresar su email').fadeIn().parent('.form-group').addClass('hasError');
                emailError = true;
            } else {
                $(this).siblings('.error').text('').fadeOut().parent('.form-group').removeClass('hasError');
                emailError = false;
            }
        }

        // PassWord
        if ($(this).hasClass('pass')) {
            if ($(this).val().length < 8) {
                $(this).siblings('span.error').text('Porfavor ingrese una contraseña mayor de 8 caracteres').fadeIn().parent('.form-group').addClass('hasError');
                passwordError = true;
            } else {
                $(this).siblings('.error').text('').fadeOut().parent('.form-group').removeClass('hasError');
                passwordError = false;
            }
        }
        // label effect
        if ($(this).val().length > 0) {
            $(this).siblings('label').addClass('active');
        } else {
            $(this).siblings('label').removeClass('active');
        }
    });


    // form switch
    $('a.switch').click(function (e) {
        $(this).toggleClass('active');
        e.preventDefault();

        if ($('a.switch').hasClass('active')) {
            $(this).parents('.form-peice').addClass('switched').siblings('.form-peice').removeClass('switched');
        } else {
            $(this).parents('.form-peice').removeClass('switched').siblings('.form-peice').addClass('switched');
        }
    });


    // Form submit
    $('form.signup-form').submit(function (event) {
        event.preventDefault();

        if (usernameError == true || emailError == true || passwordError == true || passConfirm == true) {
            $('.name, .email, .pass, .passConfirm').blur();
        } else {
            $('.signup, .login').addClass('switched');

            setTimeout(function () { $('.signup, .login').hide(); }, 700);
            setTimeout(function () { $('.brand').addClass('active'); }, 300);
            setTimeout(function () { $('.heading').addClass('active'); }, 600);
            setTimeout(function () { $('.success-msg p').addClass('active'); }, 900);
            setTimeout(function () { $('.success-msg a').addClass('active'); }, 1050);
            setTimeout(function () { $('.form').hide(); }, 700);
        }
    });

    $(".selLabel").click(function () {
    $('.dropdown').toggleClass('active');
  });
  
  $(".dropdown-list li").click(function() {
    $('.selLabel').text($(this).text());
    $('.dropdown').removeClass('active');
    $('.selected-item span').text($('.selLabel').text());
  });
});

$("#Login").click(function (){
    var x = $("#usuario").val();
    var y = $("#password").val();
    var z = $("#sedet").val();
    $.post("Login",{"user":x,"pass":y,"sede":z,"opc":1},function (data) {
        
           $(location).attr('href', 'http://localhost:8080/ProyectoPlateria/main.jsp');

    });
});
$("#remember").click(function (){
    var z = $("#emailR").val();
    $.get("Login",{"email":z,"opc":2},function (data) {
       alert(data);
       alert(z);
       var x = JSON.parse(data);
    });
});



