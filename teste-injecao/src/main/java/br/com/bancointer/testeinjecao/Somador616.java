package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador616")
public class Somador616 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
