$(document).ready(function() {
	
	$('.error').hide();
	
	$('#formCuenta').submit(function(event) {

		var json = $(this).serializeObject();
		
		$.ajax({
			url : $(this).attr("action"),
			data : JSON.stringify(json),
			type : "POST",
			dataType: "json",
			beforeSend : function(xhr) {
				xhr.setRequestHeader("Accept","application/json");
				xhr.setRequestHeader("Content-Type","application/json");
			},
			success : function(respuesta) {
								
				if(respuesta)
					window.location.href = '${pageContext.request.contextPath}/home';
				else
					$(".error").hide().fadeIn(1000);
			}
		});
		event.preventDefault();
	});
});