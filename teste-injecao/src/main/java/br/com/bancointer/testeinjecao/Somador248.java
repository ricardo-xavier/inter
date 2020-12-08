package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador248")
public class Somador248 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
