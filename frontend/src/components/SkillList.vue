<script>
import Skill from "./Skill.vue";

export default {
  name: 'skill-list',
  components: {
    Skill,
  },
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
      <skill v-for="skill in skills" :key="skill" :skill="skill"></skill>
    </ul>
  </div>
</template>

<style scoped>
div {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  padding: 10px;
}

ul {
  list-style: none;
  padding-left: 0;
  text-align: center;
}
</style>