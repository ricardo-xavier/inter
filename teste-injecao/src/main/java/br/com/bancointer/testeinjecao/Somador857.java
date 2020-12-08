package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador857")
public class Somador857 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
