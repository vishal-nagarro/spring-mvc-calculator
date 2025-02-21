<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
    <style>
    	
    	body{
    		font-family:sans-serif;
    	}
    	
    	h1 {	
		    text-align: center;
		}
    
        .container {
            width: 400px;
            margin: 50px auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        .form-group {
            margin-bottom: 15px;
        }
        .error {
            color: red;
            margin-bottom: 10px;
        }
        .result {
            color: green;
            margin-bottom: 10px;
            font-weight: bold;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Simple Calculator</h1>
        <br>
        
        
        <form action="calculate" method="post">
            <div class="form-group">
                <label for="num1">Number 1: </label>
                <input type="number" id="num1" name="num1" value="${num1}" required>
            </div>
            
            <div class="form-group">
                <label for="num2">Number 2: </label>
                <input type="number" id="num2" name="num2" value="${num2}" required>
            </div>
            
            <div class="form-group">
                <label for="operation">Operation: </label>
                <select id="operation" name="operation">
                    <option value="add" ${operation == 'add' ? 'selected' : ''}>Add</option>
                    <option value="subtract" ${operation == 'subtract' ? 'selected' : ''}>Subtract</option>
                    <option value="multiply" ${operation == 'multiply' ? 'selected' : ''}>Multiply</option>
                    <option value="divide" ${operation == 'divide' ? 'selected' : ''}>Divide</option>
                </select>
            	<button type="submit">Calculate</button>
            </div>
        </form>
        
        <!-- Showing result from model attribute "result" -->
        <% if (request.getAttribute("result") != null) { %>
          <div class="result">Result: ${result}</div>
        <% } %>
        
    </div>
</body>
</html>