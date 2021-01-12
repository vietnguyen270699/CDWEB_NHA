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
$(document).ready(function() {
	$(".btn-delete").click(function() {
		var id = $(this).attr("data-id");
		$.ajax({
			url: "/hostel/list/deletepostsave/" + id,
			success: function(response) {
				if (response) {
					alert("Đã xóa thành công: " + id)
					  location.reload();
				}else{
					alert("Xóa thất bại : " + id )
					  location.reload();
				}
			}
		})
	})
})