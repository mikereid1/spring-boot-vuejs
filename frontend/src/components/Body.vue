<script>
import JSConfetti from 'js-confetti'
const jsConfetti = new JSConfetti()

export default {
    name: 'Body',
    methods: {
        confetti() {
            jsConfetti.addConfetti()
        }
    },
}
</script>

<template>
    <div style="text-align: center;">
        <img @click="confetti" src="@/assets/me.png" alt="profile" width="125" class="image">
        <p>
            I am a software developer with several years of experience mainly working on backends.<br>
            I enjoy learning new things and currently I work as a backend developer for <a
                href="https://www.spreadgroup.com">Spread Group</a>.
        </p>
        <br>
        <p>
            <h3>Skills</h3>
            Java<br>
            Kotlin<br>
            Spring Boot<br>
            JavaScript<br>
            Vue.js<br>
            MySQL<br>
        </p>

        <br>
    </div>
</template>

<style scoped>
.image {
    border-radius: 50%;
    border: 5px solid #000;
}
</style>