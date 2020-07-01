<template>
  <div class="books">
    <header>
        <Menu/>
    </header>
    <main id="container">
        <h2>Pesquisar Livros</h2>
        <hr>
        <form @submit.prevent="saveAndUpdateBook">
            <fieldset>
              <div class="lacuna">
                <label for="nome-livro">Nome do livro</label>
                <input type="text" id="nome-livro" v-model="book.nome" name="nome-livro"><br>
              </div>
              <div class="lacuna">
                <label for="autor">Autor</label>
                <input type="text" id="autor" v-model="book.autor" name="autor"><br>
              </div>
              <div class="lacuna">
                <label for="ilustrador">Ilustrador</label>
                <input type="text" id="ilustrador" v-model="book.ilustrador" name="ilustrador"><br>
              </div>
              <div class="lacuna">
                <label for="ISBN">ISBN</label>
                <input type="text" id="ISBN" v-model="book.isbn" name="ISBN"><br>
              </div>
              <div class="lacuna">
                <label for="paginas">Páginas</label>
                <input type="text" id="paginas" v-model="book.qntPaginas" name="paginas"><br>
              </div>
              <div class="botoes-form">
                <input type="submit" value="Salvar">
                <input type="submit" v-show="book.id" @click="cancelUpdate" value="Cancelar">
              </div>
            </fieldset>
        </form>
        <hr>
        <section>
          <p class="subtitulo">Quantidade de Livros: {{books.length}}</p>
          <form @submit.prevent="findById">
            <div class="lacuna">
                <label for="pesquisa-codigo">Código</label>
                <input type="text" id="pesquisa-codigo" v-model="book.id" name="pesquisa-codigo"><br>
              </div>
              <div class="botoes-form">
                <input type="submit" value="Pesquisar">
              </div>
          </form>
          <div v-show="findBook.id">
            <p>Livro Encontrado<br>Código: {{findBook.id}} <br>Nome: {{findBook.nome}}<br>Autor: {{findBook.autor}}<br>Ilustrador: {{findBook.ilustrador}}<br>ISBN: {{findBook.isbn}}<br>Qnt. de Páginas: {{findBook.qntPaginas}} </p>
          </div>
          <table v-show="books.length > 0"><!--v-show="books.length > 0"-->
            <thead>
              <tr>
                <th>Código</th>
                <th>Nome</th>
                <th>Autor</th>
                <th>Ilustrador</th>
                <th>ISBN</th>
                <th>Qnt. de páginas</th>
                <th>Excluir</th>
                <th>Alterar</th>
              </tr>
            </thead>
            <tbody>
              <tr v-for="book in books" :key="book.id">
                <td>{{book.id}}</td>
                <td>{{book.nome}}</td>
                <td>{{book.autor}}</td>
                <td>{{book.ilustrador}}</td>
                <td>{{book.isbn}}</td>
                <td>{{book.qntPaginas}}</td>
                <td>
                  <button class="botao" @click="deleteBook(book)">Excluir</button>
                </td>
                <td>
                  <button class="botao" @click="updateBook(book)">Alterar</button>
                </td>
              </tr>
            </tbody>
          </table>
        </section>
    </main>
  </div>
</template>

<script>
import Menu from './Menu.vue';
import BookServices from '../services/bookservices'


export default {
  data() {
    return{
      book: {
        id: '',
        nome: '',
        autor: '',
        ilustrador: '',
        isbn: '',
        qntPaginas: ''
      },
      findBook: {
        id: '',
        nome: '',
        autor: '',
        ilustrador: '',
        isbn: '',
        qntPaginas: ''
      },
      books: []
    }
  },
  name: 'Books',
  props: {
    
  },
  components: {
    Menu
  },
  mounted() {
    this.listBooks();
  },
  methods: {
    listBooks() {
      BookServices.findAll().then(response => {
        this.books = response.data;
      });
    },
    saveAndUpdateBook() {
      if (!this.book.id) {

        BookServices.save(this.book).then(response => {
          this.listBooks();
          this.book = {}
          alert("Livro Adicionado com sucesso");
          return response;
        })

      } else {

        BookServices.update(this.book).then(response => {
          this.listBooks();
          this.book = {}
          alert("Livro atualizado com sucesso");
          return response;
        })

      }
    },
    deleteBook(book) {
      if(confirm("Deseja excluir o livro?")){
        BookServices.delete(book).then(response => {
        this.listBooks();
        alert("Livro Excluido com sucesso")
        return response;
      })
      }
    },
    findById() {
      BookServices.findById(this.book).then( response => {
        this.book = response.data;
      })
    },
    updateBook(book) {

      this.book = book;

    },
    calcelUpdate() {
      this.book = {};
      alert("Alteração cancelada");
    }
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
h2, .subtitulo{
  font-size: 2em;
  line-height: 4rem;
  text-align: center;
  font-weight: 300;
  margin-top: 7vh;
}
table{
  text-align: center;
  border: 1pt solid rgba(98, 98, 98, 0.5);
  width: 100%;
}
th, td{
  width: 12.5%;
  border: 1px solid rgba(98, 98, 98, 0.5);
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
.botoes-form input, .botao{
  text-align: center;
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
.botoes-form input:hover, .botao:hover{
  border: 1pt solid rgba(0, 0, 0, 0.1);
  box-shadow: 0px 0px 5px 0px rgba(98, 98, 98, 0.75);
  background-color: #007bff;
  color:white;
  outline: none;
  
}
.botoes-form input:active, .botao:active{
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