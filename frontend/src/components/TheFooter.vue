<script>
export default {
  name: 'the-footer',
  data() {
    return {
      email: 'michaelreid73@gmail.com',
      linkedin: 'https://www.linkedin.com/in/michaelreid87/',
      github: 'https://github.com/mikereid1/',
    }
  },
}
</script>

<template>
  <div>
    <hr>
    <ul>
      <li><a :href="`mailto:${email}`">Email</a></li>
      <li><a :href="linkedin">LinkedIn</a></li>
      <li><a :href="github">GitHub</a></li>
    </ul>
  </div>
</template>

<style scoped>
hr {
  width: 50%;
}
div {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}
ul {
  list-style: none;
}
</style>