 $(function(){   
 
	$(window).scroll(function(){

        var navbar = $("#navbar");

        navbar.toggleClass("scrolled", $(this).scrollTop() > 50);
    });
 });