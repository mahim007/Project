<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <h2 style="alignment: center; color: green">
        <form action="/updateStudent" name="update" method="post">
            <fieldset>
                <legend><h2 style="alignment: center">Update Student</h2></legend>
                ID: <input type="text" name="id" value=${student.id}><br>
                Name: <input type="text" name="name" value=${student.name}><br>
                Age: <input type="text" name="age" value=${student.age}><br>
                Lang: <input type="text" name="lang" value=${student.lang}><br>
                <input type="submit" value="Proceed">
            </fieldset>
        </form>
    </h2>
</body>
</html>