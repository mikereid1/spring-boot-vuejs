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
  <h1>{{ name }}</h1>
  <p>Software Engineer</p>
  <img @click="confetti" src="@/assets/me.png" alt="profile" width="125">
</template>

<style scoped>

</style>