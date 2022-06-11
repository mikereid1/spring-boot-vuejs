<script>
export default {
    name: 'Footer',
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
    <div class="center">
        <address>
            <a :href="`mailto:${email}`">Email</a><br>
            <a :href="linkedin">LinkedIn</a><br>
            <a :href="github">GitHub</a><br>
        </address>
    </div>
</template>

<style scoped>
.center {
    text-align: center;
}
</style>