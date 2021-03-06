import axios from 'axios'

export default {
  /**
   *  팀 생성
   *  param : 팀의 세부사항
   */
  create(detail) {
    return new Promise((resolve, reject) => {
      axios.post('/teams', detail).then(({ data }) => {
        resolve(data)
      }).catch((error) => {
        reject(error)
      })
    })
  }
}
