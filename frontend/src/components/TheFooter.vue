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
  <ul>
    <li><a :href="`mailto:${email}`">Email</a></li>
    <li><a :href="linkedin">LinkedIn</a></li>
    <li><a :href="github">GitHub</a></li>
  </ul>
</template>

<style scoped>

</style>