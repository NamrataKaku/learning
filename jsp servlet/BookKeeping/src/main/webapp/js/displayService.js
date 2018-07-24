/**
 * 
 */

function loadBooksService(){
	console.log("loadBookService function is called");
	$.ajax({
		url:"BookKeeping/Display",
		method: "GET",
		success: function(){
			console.log("call is a success");
		}
			
	})
}