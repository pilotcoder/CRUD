<%--
  Created by IntelliJ IDEA.
  User: marcin
  Date: 2023. 03. 18.
  Time: 18:26
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%@ include file="/header.jsp" %>
<div class="container-fluid">

  <!-- Page Heading -->
  <div class="d-sm-flex align-items-center justify-content-between mb-4">
    <h1 class="h3 mb-0 text-gray-800">UsersCRUD</h1>
    <a href="<c:url value="/user/list"/>" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
      <i class="fas fa-download fa-sm text-white-50"></i> Lista użytkowników</a>
  </div>
  <div class="card shadow mb-4">
    <div class="card-header py-3">
      <h6 class="m-0 font-weight-bold text-primary">DODAJ UŻYTKOWNIKA</h6>
    </div>
    <div class="card-body">
      <div class="table-responsive">
        <table class="table">


            <tr>
              <form method="post" action="/user/add">
                Nazwa: </br>
                <input type="text" name="username" value="Nazwa Użytkownika"> </br>
                Email : </br>
                <input type="text" name="email" value="Email użytkownika"> </br>
                Hasło: </br>
                <input type="text" name="password" value="Hasło użytkownika"> </br>
              </br>
                <input type="submit" value="DODAJ">
              </form>


            </tr>

        </table>
      </div>
    </div>
  </div>
</div>
<!-- /.container-fluid -->
<%@ include file="/footer.jsp" %>