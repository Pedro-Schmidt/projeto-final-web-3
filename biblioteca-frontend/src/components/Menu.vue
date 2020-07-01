<template>
  <div class="menu">
    <h1><a>&#x1F4DA;</a>&emsp;Bibliotech</h1>
    <hr>
    <nav>
      <a href="#">Pesquisar Livros</a>
      
      <a href="#">Sobre</a>
    </nav>
    <hr>
  </div>
</template>

<script>
export default {
  name: 'Menu',
  props: {
    
  }
}
</script>

<style scoped>
/* 

font-family: 'Poppins', sans-serif;
*/
.menu{
  margin: 0;
  padding: 0;
  text-align: center;
  
}
h1{
  font-size: 2.5rem;
  font-weight: 200;
  text-transform: uppercase;
}
h1 a{
  font-size: 2rem;
}
nav{
  width: 100%;
  height: 10%;
}
nav a{
  line-height: 5vh;
  text-decoration: none;
  color: inherit;
  margin: 1vh 1vw;
}
nav a:hover{
  text-shadow: 0px 0px 1rem rgba(98, 98, 98, 0.5);
}


</style>
