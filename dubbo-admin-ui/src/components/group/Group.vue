<template>
  <v-dialog max-width="600px">
    <v-btn flat slot="activator" class="success">{{groupInfo}}</v-btn>
    <v-card>
      <v-card-title>
        <h2>Add new Project</h2>
      </v-card-title>
      <v-card-text>
        <v-form class="px-3" ref="form">
          <v-text-field  label="Title" prepend-icon="folder" ></v-text-field>
          <v-textarea label="Information" prepend-icon="edit" ></v-textarea>

          <v-menu  :close-on-content-click="false">
            <v-text-field slot="activator"
                           clearable label="Due date" prepend-icon="date_range">
            </v-text-field>
            <v-date-picker ></v-date-picker>
          </v-menu>

          <v-spacer></v-spacer>

          <v-btn flat class="success mx-0 mt-3">Add Project</v-btn>
        </v-form>
      </v-card-text>
    </v-card>
  </v-dialog>
</template>

<script>
    export default {
      data: () => ({
        groupInfo: 'nihao'
      }),
      mounted: function () {

      }
    }
</script>

<style scoped>

</style>
