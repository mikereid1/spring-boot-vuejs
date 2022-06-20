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
  <div>
    <header>
      <img @click="confetti" src="@/assets/me.png" alt="profile" width="125">
      <h1>{{ name }}</h1>
      <h4>Software Engineer</h4>
    </header>
  </div>
</template>

<style scoped>
div {
  background-color: #76F7BF;
  border-bottom: solid  #499167;
}
header {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  padding: 10px;
}
</style>