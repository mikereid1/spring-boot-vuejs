<script>
import TheHeader from './components/TheHeader.vue'
import TheBody from './components/TheBody.vue'
import TheFooter from './components/TheFooter.vue'

export default {
  components: {
    TheHeader,
    TheBody,
    TheFooter,
  },
  data() {
    return {
      name: "Michael Reid"
    }
  }
}
</script>

<template>
  <the-header />
  <the-body />
  <the-footer />
</template>

<style>
* {
  box-sizing: border-box;
}

html {
  font-family: system-ui;
}
body {
  margin: 0;
  background-color: #91F9E5;
}
</style>