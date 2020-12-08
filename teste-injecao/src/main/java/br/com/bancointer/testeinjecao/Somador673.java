package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador673")
public class Somador673 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
