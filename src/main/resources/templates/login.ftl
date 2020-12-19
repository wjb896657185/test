<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <#list  users as user>
        <tr>
           <th>${user.uname}</th>
            <th>${user.age}</th>
            <th>${user.uid}</th>
            <th>${user.salary}</th>
        </tr>

    </#list>
</body>
</html>