<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<p style="alignment: center; color: darkcyan">
    <form action="/welcome">
        <fieldset>
            <legend><h2 style="alignment: center">Student Information</h2></legend>
            <p style="color: crimson">ID: </p><input type="text" name="id" value=${student.id}><br>
            <p style="color: crimson">Name: </p><input type="text" name="name" value=${student.name}><br>
            <p style="color: crimson">Age: </p><input type="text" name="age" value=${student.age}><br>
            <p style="color: crimson">Lang: </p><input type="text" name="lang" value=${student.lang}><br>
            <input type="submit" value="OK">
        </fieldset>
    </form>
</h2>
</body>
</html>