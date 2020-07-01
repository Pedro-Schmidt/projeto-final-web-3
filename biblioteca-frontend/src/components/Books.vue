<template>
  <div class="books">
    <header>
        <Menu/>
    </header>
    <main id="container">
        <h2>Pesquisar Livros</h2>
        <hr>
        <form>
            <fieldset>
              <div class="lacuna">
                <label for="nome-livro">Nome do livro</label>
                <input type="text" id="nome-livro" name="nome-livro"><br>
              </div>
              <div class="lacuna">
                <label for="autor">Autor</label>
                <input type="text" id="autor" name="autor"><br>
              </div>
              <div class="lacuna">
                <label for="ilustrador">Ilustrador</label>
                <input type="text" id="ilustrador" name="ilustrador"><br>
              </div>
              <div class="lacuna">
                <label for="ISBN">ISBN</label>
                <input type="text" id="ISBN" name="ISBN"><br>
              </div>
              <div class="lacuna">
                <label for="paginas">Páginas</label>
                <input type="text" id="paginas" name="paginas"><br>
              </div>
              <div class="botoes-form">
                <input type="submit" value="Enviar">
                <input type="reset">
              </div>
            </fieldset>
        </form>
        <hr>
        <section>
          <table>
            <thead>
              <tr>
                <th>Nome</th>
                <th>Autor</th>
                <th>Ilustrador</th>
                <th>ISBN</th>
                <th>Qnt. de páginas</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td>Body content 1</td>
                <td>Body content 2</td>
                <td>Body content 1</td>
                <td>Body content 2</td>
                <td>Body content 1</td>
                
              </tr>
            </tbody>
          </table>
        </section>
    </main>
  </div>
</template>

<script>
import Menu from './Menu.vue';

export default {
  name: 'Books',
  props: {
    
  },
  components: {
    Menu
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
    
}
.container{
  /*width: 70%;
  margin: 0 15%;*/
  
}
h2{
  font-size: 2em;
  line-height: 4rem;
  text-align: center;
  font-weight: 300;
  margin-top: 7vh;
}
form{
  margin: 1%;
  
}
form fieldset{
  border: none;
}
.lacuna{
  margin: 2.5vh 1vw;
  text-align: center;
}
.lacuna label{
  font-size: 0.8rem;
  display: block;
  /*margin-left: 1vw;*/
  cursor: default;
  line-height: 1.5rem;
}
.lacuna input{

  -webkit-writing-mode: horizontal-tb !important;
  writing-mode: horizontal-tb;
  text-rendering: auto;
  color: -internal-light-dark-color(black, white);
  letter-spacing: normal;
  word-spacing: normal;
  text-transform: none;
  text-indent: 0px;
  text-shadow: none;
  display: inline-block;
  text-align: start;
  -webkit-appearance: textfield;
  background-color: -internal-light-dark-color(rgb(255, 255, 255), rgb(59, 59, 59));
  -webkit-rtl-ordering: logical;
  cursor: text;

  font-size: 1rem;
  -webkit-border-radius: 3rem;
  -moz-border-radius: 3rem;
  border-radius: 3rem;
  border: 1pt solid rgba(98, 98, 98, 0.5);
  box-shadow: 0px 0px 5px 0px rgba(98, 98, 98, 0.75);
  padding: 0 1%;
  line-height: 2rem;
  transition: 0.3s ease-in-out;
}
.lacuna input:focus{
  font-size: 1.5rem;
  border-radius: 3rem;
  border: 1pt solid rgba(0, 123, 255, 0.5);
  box-shadow: 0px 0px 5px 0px rgba(0, 123, 255, 0.75);
  outline: none;
  
}
.botoes-form{
  margin: 2.5vh 1vw;
  text-align: center;
  
}
.botoes-form input{

  -webkit-writing-mode: horizontal-tb !important;
  writing-mode: horizontal-tb;
  text-rendering: auto;
  
  letter-spacing: normal;
  word-spacing: normal;
  
  text-indent: 0px;
  text-shadow: none;
  display: inline-block;
  
  
  -webkit-rtl-ordering: logical;
  cursor: pointer;

  margin: 1%;
  width: 10vw;
  border-radius: 3rem;
  outline: none;
  border: 1pt solid rgba(0, 123, 255, 0.75);
  background-color: white;
  color: rgba(0, 123, 255, 0.75);
  line-height: 2rem;
  box-shadow: 0px 0px 5px 0px rgba(98, 98, 98, 0.75);
  transition: 0.2s ease-in-out;
  text-transform: uppercase;
  font-size: 0.8rem;
}
.botoes-form input:hover{
  border: 1pt solid rgba(0, 0, 0, 0.1);
  box-shadow: 0px 0px 5px 0px rgba(98, 98, 98, 0.75);
  background-color: #007bff;
  color:white;
  outline: none;
  
}
.botoes-form input:active{
  border: 1pt solid rgba(0, 123, 255, 0.5);
  box-shadow: 0px 0px 5px 0px rgba(0, 123, 255, 0.75);
  outline: none;
}

</style>
<!--

-webkit-writing-mode: horizontal-tb !important;
    text-rendering: auto;
    color: -internal-light-dark-color(black, white);
    letter-spacing: normal;
    word-spacing: normal;
    text-transform: none;
    text-indent: 0px;
    text-shadow: none;
    display: inline-block;
    text-align: start;
    -webkit-appearance: textfield;
    background-color: -internal-light-dark-color(rgb(255, 255, 255), rgb(59, 59, 59));
    -webkit-rtl-ordering: logical;
    cursor: text;
    margin: 0em;
    font: 400 13.3333px Arial;

-->