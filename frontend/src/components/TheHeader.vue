<script>
import JSConfetti from 'js-confetti'

const jsConfetti = new JSConfetti()

export default {
  name: 'the-header',
  data() {
    return {
      name: "Michael Reid"
    }
  },
  methods: {
    confetti() {
      jsConfetti.addConfetti()
    }
  },
}
</script>

<template>
  <header>
    <img @click="confetti" src="@/assets/me.png" alt="profile" width="125">
    <h1>{{ name }}</h1>
    <h4>Software Engineer</h4>
  </header>
</template>

<style scoped>
header {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  text-align: center;
  background-color: #116466;
  color: #d1e8e2;
}

img {
  border: solid #2c3531;
  border-radius: 50%;
}
</style>