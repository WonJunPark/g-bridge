<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="bridgeweb.addrbook.*, java.util.*"%>
   
<% request.setCharacterEncoding("utf-8"); %>

<jsp:useBean id="addrbook" class="bridgeweb.addrbook.AddrBook" />
<jsp:setProperty property="*" name="addrbook" />

<%
	AddrBookDAO dao = new AddrBookDAO();
	// 파라미터 값 받기
	String action = request.getParameter("action");

	if(action.equals("insert")){
		dao.insertDB(addrbook);
		// redirect : 데이터 없이 단순히 url 이동
		response.sendRedirect("addrbook_control.jsp?action=list");
	} else if(action.equals("list")){
		List<AddrBook> datas = dao.getDBList();
		request.setAttribute("datas", datas);
		// forward : 데이터를 가지고 이동
		pageContext.forward("addrbook_list.jsp");
	}
%>
