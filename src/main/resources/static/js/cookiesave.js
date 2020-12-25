$(document).ready(function() {
	$(".btn-save").click(function() {
		var id = $(this).attr("data-id");
		$.ajax({
			url: "/hostel/list/postsave/" + id,
			success: function(response) {
				if (response) {
					alert("Đã lưu thành công: " + id)
				}else{
					alert("Đã tồn tại: " + id )
				}
			}
		})
	})
})
