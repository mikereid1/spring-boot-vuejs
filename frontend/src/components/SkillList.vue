<script>

export default {
  name: 'skill-list',
  data() {
    return {
      skills: ['Java', 'Kotlin', 'Spring Boot', 'JavaScript', 'Vue.js', 'MySQL']
    }
  }
}
</script>

<template>
  <div>
    <h3>Skills</h3>
    <ul>
      <li v-for="skill in skills" :key="skill">{{ skill }}</li>
    </ul>
  </div>
</template>

<style scoped>
div {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}
ul {
  list-style: none;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}
</style>