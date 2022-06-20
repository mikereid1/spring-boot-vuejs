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
  <hr>
  <div>
    <ul>
      <li><a :href="`mailto:${email}`">Email</a></li>
      <li><a :href="linkedin">LinkedIn</a></li>
      <li><a :href="github">GitHub</a></li>
    </ul>
  </div>
</template>

<style scoped>
div {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  text-align: center;
  padding: 10px;
}

ul {
  list-style: none;
  padding-left: 0;
}

a {
  color: #116466;
  text-decoration: none;
}
</style>