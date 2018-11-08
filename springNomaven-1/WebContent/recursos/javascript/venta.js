function prueba() {
	swal({
		  position: 'top-end',
		  type: 'success',
		  title: 'Your work has been saved',
		  showConfirmButton: false,
		  timer: 1500
		})
}
$("#prueba1").click(function() {
	var num = $("#Contado").val();
	alert(num);
})