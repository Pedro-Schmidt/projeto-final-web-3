<template>
  <div class="books">
    <header>
        <!--<Menu/> Not done yet-->
    </header>
    <main id="main-content">
        
    </main>
    <footer id="rodape">

    </footer>
  </div>
</template>

<script>
export default {
  name: 'Books',
  props: {
    
  }
}
</script>

<style scoped>
/* 

font-family: 'Poppins', sans-serif;
*/
.books{
    width: 100%;
    height: 100%;
    position: absolute;
}
#main-content{
    width: 100%;
    height: 70%;
}
#rodape{
    width: 100%;
    height: 10%;
}

</style>
