<%@page import="java.util.Comparator"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 

	//디렉토리 탐색
	//File dir = new File(경로);

	String path = application.getRealPath("/example/images");
	File dir = new File(path);
	
	File[] list = dir.listFiles();
	
	
	/*
	
	System.out.println(Arrays.toString(list));
	
	[
	 C:\class\server\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\JSPTest\example\images\0.png, 
	 C:\class\server\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\JSPTest\example\images\rect_icon08.png
	]
			
	System.out.println(list[0].getName()); 
	
	0.png
	
	System.out.println(list[0].lastModified());
	Calendar temp = Calendar.getInstance();
	temp.setTimeInMillis(list[0].lastModified());
	System.out.printf("%tF %tT\n", temp, temp);
	
	1655994321640
	2022-06-23 23:25:21 > 업로드한 시간 > sort하기
			
	*/
	
	/*
	Arrays.sort(list, (a,b) -> {
		return Long.compare(a.lastModified(), b.lastModified());
	});
	*/
	
	Arrays.sort(list, new Comparator<File>() {
		public int compare(File a, File b) {
			return Long.compare(a.lastModified(), b.lastModified());
		}
	});

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%@ include file="/example/inc/asset.jsp" %>

<style>

	#list {
		width: 800px;
		margin-top: 20px;
		margin-bottom: 50px;
		/* margin-bottom: 100px; */
		/* outline: 10px solid black; */
	}
	
	#list > div {
		float: left;
		border: 1px solid #999;
		margin: 15px;
		width: 126px;
		height: 126px;
		background-size: contain;
		/*background-size: cover;*/
		background-repeat: no-repeat;
		background-position: center center;
		position: relative;
		left: 0;
		top: 0;
	}
	
	#list > div > span {
		font-size: 1.5em;
		position: absolute;
		right: 6px;
		top: 0;
		cursor: pointer;
		display: none;
	}
	
	#list > div:hover > span {
		display: inline;
	}
	
	#list::after {
		content: '';
		display: block;
		clear: both;
	}
		
	/*	
	#list > div > img {
		width: 126px;
		height: 126px;	
	}*/
	
	.modal-body > img {
		display: block;
		margin: 15px auto;
		max-width: 560px;
		
		/*
		width: ; > 고정 크기
		max-width: ; > 작을땐 객체 크기, 클땐 최대 크기 지정
		min-width: ; > 클땐 객체 크기, 작을땐 최소 크기 지정 		
		*/

	}
	
	#exampleModal .modal-dialog {
       -webkit-transform: translate(0,-50%);
       -o-transform: translate(0,-50%);
       transform: translate(0,-50%);
       top: 50%;
       margin: 0 auto;
   }

</style>

</head>
<body>

	<!--  ex20_file_form.jsp  -->
	
	<div class="container">
	
		<h1>Images Gallery</h1>
	
		<div id="list">
			
			<% for (File img : list) { %>
			
			<%-- <div><img src="images/<%= img.getName() %>"></div> --%>
			<div style="background-image:url(images/<%= img.getName() %>);" data-toggle="modal" data-target="#exampleModal" onclick="showImage('<%= img.getName() %>');">
				<span title="delete" onclick="deleteImage(<%= img.getName() %>);">&times;</span>
			</div>
			
			<% } %>
			
			<!-- <div style="clear:both;float:none;"></div> -->
			<!-- float 때문에 부모가 인식 못했던 것 방지 -->
			<!-- margin 적용 안될때 > float 의심하기 -->
			
		</div>
		
		<form method="POST" action="ex20_file_ok.jsp" enctype="multipart/form-data">
		<table class="table">
			<tr>
				<th>이미지</th>
				<td><input type="file" name="attach" required></td>
			</tr>
		</table>
		
		<div>
			<input type="submit" value="이미지 업로드" class="btn btn-success">
		</div>
		</form>
		
	</div>
	
	<!-- Modal -->
	
	<script>
	
		function showimage(img) {
			//alert(img);
			
			$('.modal-body > img').attr('src', 'images/' + img);
			$('#exampleModalLabel').text(img);
			
		}
		
		function deleteImage(img) {
			//alert(img);
			
			//event.cancleBubble = false;
			
			if (confirm('delete?')) {
				location.href = 'ex20_file_delete.jsp?filename=' + img;
			}
			
			event.stopPropagation();
			
			
		}
	
	</script>
	
</body>
</html>