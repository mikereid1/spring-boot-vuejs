<script>
import Header from './components/Header.vue'
import Body from './components/Body.vue'
import Footer from './components/Footer.vue'

export default {
  components: {
    Header,
    Body,
    Footer,
  },
  data() {
    return {
      name: "Michael Reid"
    }
  }
}
</script>

<template>
  <Header />
  <Body />
  <Footer />
</template>

<style>
</style>