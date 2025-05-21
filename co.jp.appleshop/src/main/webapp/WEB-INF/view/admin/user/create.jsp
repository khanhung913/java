<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
            <!DOCTYPE html>
            <html lang="en">

            <head>
                <meta charset="utf-8" />
                <meta http-equiv="X-UA-Compatible" content="IE=edge" />
                <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
                <meta name="description" content="" />
                <meta name="author" content="" />
                <title>User Create - SB Admin</title>
                <link href="/css/styles.css" rel="stylesheet" />
                <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
                <script>
                    $(document).ready(() => {
                        const avatarFile = $("#avatarFile");
                        avatarFile.change(function (e) {
                            const imgURL = URL.createObjectURL(e.target.files[0]);
                            $("#avatarPreview").attr("src", imgURL);
                            $("#avatarPreview").css({ "display": "block" });
                        });
                    });
                </script>
                <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
            </head>

            <body class="sb-nav-fixed">
                <jsp:include page="../layout/header.jsp" />
                <div id="layoutSidenav">
                    <jsp:include page="../layout/sideNav.jsp" />
                    <div id="layoutSidenav_content">
                        <main>
                            <div class="container mt-5">
                                <div class="row">
                                    <div class="col-md-6 col-12 mx-auto">
                                        <h3>Create a user</h3>
                                        <hr />
                                        <form:form method="post" action="/admin/user/create"
                                            enctype="multipart/form-data" modelAttribute="newUser" class="row g-3">
                                            <div class="col-md-6">
                                                <label class="form-label">Email address:</label>
                                                <form:input type="email" class="form-control" path="email" />
                                                <form:errors path="email" />
                                            </div>
                                            <div class="col-md-6">
                                                <label class="form-label">Password:</label>
                                                <form:input type="password" class="form-control" path="password" />
                                                <form:errors path="password" />
                                            </div>
                                            <div class="col-md-6">
                                                <label class="form-label">First Name:</label>
                                                <form:input type="text" class="form-control" path="firstName" />
                                                <form:errors path="firstName" />
                                            </div>
                                            <div class="col-md-6">
                                                <label class="form-label">Last Name:</label>
                                                <form:input type="text" class="form-control" path="lastName" />
                                                <form:errors path="lastName" />
                                            </div>
                                            <div class="mb-3">
                                                <label class="form-label">Phone number:</label>
                                                <form:input type="text" class="form-control" path="phone" />
                                            </div>
                                            <div class="mb-3">
                                                <label class="form-label">Address:</label>
                                                <form:input type="text" class="form-control" path="address" />
                                            </div>
                                            <div class="col-md-6">
                                                <label class="form-label">Role:</label>
                                                <form:select class="form-select" path="role.roleName">
                                                    <form:option value="USER">USER</form:option>
                                                    <form:option value="ADMIN">ADMIN</form:option>
                                                </form:select>
                                            </div>
                                            <div class="col-md-6">
                                                <label for="avatarFile" class="form-label">Choose avatar:</label>
                                                <input class="form-control" type="file" id="avatarFile" name="file"
                                                    accept=".png,.jpg,.jpeg" />
                                            </div>
                                            <div class="col-12 mt-5 d-flex justify-content-center">
                                                <img style="max-height: 150px;display: none;" id="avatarPreview"
                                                    alt="Avatar Preview">
                                            </div>
                                            <div class="col-12 mb-5 mt-5 d-flex justify-content-center">
                                                <button type="submit" class="btn btn-primary">Submit</button>
                                            </div>
                                        </form:form>
                                    </div>
                                </div>
                            </div>
                        </main>
                        <jsp:include page="../layout/footer.jsp" />
                    </div>
                </div>
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
                    crossorigin="anonymous"></script>
                <script src="/js/scripts.js"></script>
            </body>

            </html>