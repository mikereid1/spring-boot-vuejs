<script>export default {
  name: 'skill',
  props: {
    skill: {
      type: String,
      required: true,
    }
  }
}
</script>

<template>
  <p>{{ skill }}</p>
</template>

<style scoped>

</style>