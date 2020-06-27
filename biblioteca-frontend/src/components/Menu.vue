<template>
  <div class="menu">
    <div class="filler-menu"></div>
    <main id="menu-principal">
        <h1>Biblioteca</h1>
        <nav>
            <div class="item-menu">
                <a href="#">&emsp;&emsp;Pesquisar Livros&emsp;&emsp;</a>
            </div>
            <div class="item-menu">
                <a href="#">&emsp;&emsp;Pesquisar Livros&emsp;&emsp;</a>
            </div>
        </nav>
    </main>
    <div class="filler-menu">
        <footer id="rodape-menu">
            
            <p>&copy;Copyright</p>
        </footer>
    </div>
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
    width: 100%;
    height: 100%;
    margin: 0;
    padding: 0;
    background-color: #efefef;
}
#menu-principal{
    width: 40%;
    height: 60%;
    margin: 0 30%;
    background-color: white;
    display: block;
    border-radius: 0.7rem;
    box-shadow: 0px 0px 7px 0px rgba(68, 68, 68, 0.75);
    text-align: center;
    padding-top: 3%;
}
#menu-principal h1{
    text-transform: uppercase;
    font-family: 'Poppins', sans-serif;
    font-weight: 200;
    font-size: 3rem;
    text-shadow: 0px 0px 7px rgba(68, 68, 68, 0.75);;
}
.item-menu{
    height: 5.5vh;
    width: 80%;
    /*border: 1px solid #323232;*/
    display: flex;
    justify-content: center;
    align-items: center;
    text-align: center;
    margin: 10vh 10%;
}
.item-menu a{
    background-color: transparent;
    font-family: 'Poppins', sans-serif;;
    font-weight: 300;
    letter-spacing: 0.1vw;
    text-decoration: none;
    font-size: 1.8vh;
    line-height: 5vh;
    width: 90%;
    text-transform: uppercase;
    border-radius: 3rem;
    -webkit-transition: background-color 0.2s ease-out;
    -moz-transition: background-color 0.2s ease-out;
    -o-transition: background-color 0.2s ease-out;
    transition: background-color 0.2s ease-out;
}
.item-menu a:hover{
    background-color: #007bff;
    color: white;
    
}
.item-menu a:active{
    border: 1px solid #0063CC;
}
.filler-menu{
    width: 100%;
    height: 15%;
    margin: 0;
    background-color: transparent;
    display: flex;
    align-items: flex-end;
}
#rodape-menu{
    background-color: transparent;
    width: 100%;
    height: 20%;
    z-index: 9;
    text-align: center; 
    border-top: 1px solid #bfbfbf;
    background-color: #f9f9f9;
}
@media screen and (max-width: 900px) {
    #menu-principal{
        width: 70%;
        height: 80%;
        margin: 0 15%;
    }
    .filler-menu{
        width: 100%;
        height: 7.5%;
        margin: 0;
    }
    #rodape-menu{
        height: 40%;
    }
}
@media screen and (max-width: 700px) {
    #menu-principal{
        width: 90%;
        height: 90%;
        margin: 0 5%;
    }
    .filler-menu{
        width: 100%;
        height: 2.5%;
        margin: 0;
    }
    #rodape-menu{
        height: 80%;
    }
    
}

</style>
