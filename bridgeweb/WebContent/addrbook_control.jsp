<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, bridgeweb.addrbook.*"%>
 
<% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="dao" scope="application" class="bridgeweb.addrbook.AddrBookH2DAO"/>
<jsp:useBean id="addrbook" class="bridgeweb.addrbook.AddrBook" />
<jsp:setProperty property="*" name="addrbook"/>
<%  
	String action = request.getParameter("action");
	
	if(action.equals("list")) {
		List<AddrBook> datas = dao.getDBList();
		request.setAttribute("datas", datas);
		pageContext.forward("addrbook_list.jsp");
	}
	else if(action.equals("insert")) {
		dao.insertDB(addrbook);
		response.sendRedirect("addrbook_control.jsp?action=list");
	}
	else if(action.equals("edit")) {
		AddrBook ab = dao.getDB(addrbook.getAb_id());
		request.setAttribute("ab", ab);
		pageContext.forward("addrbook_edit_form.jsp");
	}
	else if(action.equals("update")) {
		dao.updateDB(addrbook);
		response.sendRedirect("addrbook_control.jsp?action=list");
	}
	else if(action.equals("delete")) {
		dao.deleteDB(addrbook.getAb_id());
		response.sendRedirect("addrbook_control.jsp?action=list");
	}
%>


