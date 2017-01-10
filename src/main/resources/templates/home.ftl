<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Hello</title>
  </head>
  <body>
    <div id="example">Heading</div>
    
    <div class="recipes">
		<#list recipes as recipe>
			<h4>${recipe.name}</h4>
			<div class="steps">
				<p>Steps:</p>
				<ul>
				<#list recipe.steps as step>
					<li>${step.no} - ${step.text}</li>
				</#list>
				</ul>
			</div>
			<div class="ingredients">
				<p>Ingredients:</p>
				<ul>
				<#list recipe.ingredients as ingredient>
					<li>${ingredient.amount} ${ingredient.measure} of ${ingredient.name}</li>
				</#list>
				</ul>
			</div>
		</#list>
	</div>
    </script>
  </body>
</html>