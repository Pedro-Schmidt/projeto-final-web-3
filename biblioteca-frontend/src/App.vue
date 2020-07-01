<template>
  <div id="app">
    
    <router-view></router-view>

  </div>
</template>

<script>


export default {
  name: 'App',
  components: {
    
  }
}
</script>

<style>

#app {
  width: 100%;
  height: 100%;
  /*font-family: Avenir, Helvetica, Arial, sans-serif;*/
  font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  font-size: 1.5vh;
  color: #2c3e50;
  /*line-height: 4vh;*/
}
</style>
