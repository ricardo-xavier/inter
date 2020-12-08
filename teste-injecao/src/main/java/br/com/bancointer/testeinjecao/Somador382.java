package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador382")
public class Somador382 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
