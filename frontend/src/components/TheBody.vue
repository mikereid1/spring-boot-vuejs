<script>
import SkillList from "./SkillList.vue";

export default {
  name: 'the-body',
  components: {
    SkillList,
  },
}
</script>

<template>
  <div>
    <p>
      I am a software developer with several years of experience working with Java and Kotlin.<br>
      The majority of my time has been spent working on backends using Spring Boot.<br>
      I enjoy learning new things and I am always improving what I know to expand my toolset.<br>
      Currently I work as a backend developer for <a href="">Spread Group</a>.
    </p>
  </div>
  <skill-list/>
</template>

<style scoped>
div {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  padding: 10px;
}
</style>